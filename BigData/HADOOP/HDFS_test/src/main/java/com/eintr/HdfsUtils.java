package com.eintr;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class HdfsUtils {
    private static Configuration conf = new Configuration();
    public static String userRootPath = "/userSpace";

    static {
        //windows下无法找到对应的环境变量，需要设置
        System.setProperty("hadoop.home.dir", "F:\\linux\\hadoop-2.7.3");
        // 指定hadoop fs的地址
        conf.set("fs.defaultFS", "hdfs://master:9000");
    }

    //判断路径是否存在
    public static boolean exists(String path) throws IOException {
        FileSystem fileSystem = FileSystem.get(conf);
        return fileSystem.exists(new Path(path));
    }

    //创建文件
    public static void createFile(String filePath, byte[] contents) throws IOException {
        FileSystem fileSystem = FileSystem.get(conf);
        Path path = new Path(filePath);
        FSDataOutputStream fdo = fileSystem.create(path);
        fdo.write(contents);
        fdo.close();
        fileSystem.close();

    }

    /**
     * 创建文件
     *
     * @param filePath
     * @param fileContent
     * @throws IOException
     */
    public static void createFile(String filePath, String fileContent)
            throws IOException {
        createFile(filePath, fileContent.getBytes());
    }

    //从本地复制到hdfs上
    public static void copyFromLocalFile(String localFilePath, String remoteFilePath) throws IOException {
        FileSystem fs = FileSystem.get(conf);
        Path localPath = new Path(localFilePath);
        Path remotePath = new Path(remoteFilePath);
        fs.copyFromLocalFile(false, true, localPath, remotePath);
        fs.close();
    }


    /**
     * 删除目录或文件
     *
     * @param remoteFilePath
     * @param recursive
     * @return
     * @throws IOException
     */
    public static boolean deleteFile(String remoteFilePath, boolean recursive)
            throws IOException {
        FileSystem fs = FileSystem.get(conf);
        boolean result = fs.delete(new Path(remoteFilePath), recursive);
        fs.close();
        return result;
    }
    /**
     * 删除目录或文件(如果有子目录,则级联删除)
     *
     * @param remoteFilePath
     * @return
     * @throws IOException
     */
    public static boolean deleteFile(String remoteFilePath) throws IOException {
        return deleteFile(remoteFilePath, true);
    }
    /**
     * 文件重命名
     *
     * @param oldFileName
     * @param newFileName
     * @return
     * @throws IOException
     */
    public static boolean renameFile(String oldFileName, String newFileName)
            throws IOException {
        FileSystem fs = FileSystem.get(conf);
        Path oldPath = new Path(oldFileName);
        Path newPath = new Path(newFileName);
        boolean result = fs.rename(oldPath, newPath);
        fs.close();
        return result;
    }
    /**
     * 创建目录
     *
     * @param dirName
     * @return
     * @throws IOException
     */
    public static boolean createDirectory(String dirName) throws IOException {
        FileSystem fs = FileSystem.get(conf);
        Path dir = new Path(dirName);
        boolean result = false;
        if (!fs.exists(dir)) {
            result = fs.mkdirs(dir);
        }
        fs.close();
        return result;
    }

    //列出指定路径下的文件
    public static  RemoteIterator<LocatedFileStatus> listFiles(String dirPath,boolean recursive) throws IOException {
        FileSystem fs = FileSystem.get(conf);
        RemoteIterator<LocatedFileStatus> listFiles = fs.listFiles(new Path(dirPath), recursive);//不进行递归
        fs.close();
        return listFiles;
    }
    /**
     * 列出指定路径下的文件（非递归）
     *
     * @param basePath
     * @return
     * @throws IOException
     */
    public static RemoteIterator<LocatedFileStatus> listFiles(String basePath)
            throws IOException {
        FileSystem fs = FileSystem.get(conf);
        RemoteIterator<LocatedFileStatus> remoteIterator = fs.listFiles(
                new Path(basePath), false);
        fs.close();
        return remoteIterator;
    }

    /**
     * 列出指定目录下的文件\子目录信息（非递归）
     *
     * @param dirPath
     * @return
     * @throws IOException
     */
    public static FileStatus[] listStatus(String dirPath) throws IOException {
        FileSystem fs = FileSystem.get(conf);
        FileStatus[] fileStatuses = fs.listStatus(new Path(dirPath));
        fs.close();
        return fileStatuses;
    }

    //读取文件内容
    public static byte[] readFile(String filePath) throws IOException {
        byte[] fileContent = null;
        FileSystem fs = FileSystem.get(conf);
        Path path = new Path(filePath);

        if (fs.exists(path)){
            FSDataInputStream fsin = fs.open(path);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            IOUtils.copyBytes(fsin,bos,conf);
            fileContent = bos.toByteArray();
        }
        return fileContent;
    }

    //下载hdfs上的文件
    public static void download(String remote,String local) throws IOException {
        FileSystem fs = FileSystem.get(conf);
        //远程hdfs上的文件
        Path remotePath = new Path(remote);
        //本地的文件
        Path localPath = new Path(local);
        fs.copyToLocalFile(remotePath,localPath);
        fs.close();
    }
}
