package com.eintr;

class Villain {
    private String name;

    protected void set(String m) {
        name = m;
    }

    Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I'm a villain my name is " + name;
    }
}

public class Orc extends Villain {
    private int orcNum;

    public Orc(String name, int orcNum) {
        super(name);
        this.orcNum = orcNum;
    }

    public void change(String name, int orcNumber) {
        set(name);
        this.orcNum = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc" + orcNum + ":" + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("eintr", 23);
        System.out.println(orc);
        orc.change("impact", 22);
        System.out.println(orc);
    }
}
