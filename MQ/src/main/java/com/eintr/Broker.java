packge com.eintr;

import java.util.concurrent.ArrayBlockingQueue;

public class Broker {
    private final static int MAX_SIZE = 3; // 队列存储消息的最大数量

    // 保存消息数据的容器
    private static ArrayBlockingQueue<String> messageQueue = new ArrayBlockingQueue<>(MAX_SIZE);

    public static void produce(String msg) {
        if (messageQueue.offer(msg))
    }

}
