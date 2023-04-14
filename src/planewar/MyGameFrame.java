package planewar;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends Frame {

    //初始化窗口
    public void launchFrame() {
        this.setTitle("飞机大战--尚学堂.百战程序员");
        this.setVisible(true);//窗口默认不可见。需要让他可见
        this.setSize(500, 500);
        this.setLocation(300, 300);
        //增加关闭窗口的动作
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MyGameFrame frame = new MyGameFrame();
        frame.launchFrame();
    }
}

