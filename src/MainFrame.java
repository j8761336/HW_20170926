import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
    public MainFrame(){
        initComp();
    }
    private Label sun =new Label("sun");
    private Label bullet =new Label("bullet");
    private Label triangle =new Label("triangle");
    private Label verylong =new Label("");
    private Button left =new Button("left");
    private Button fire =new Button("fire");
    private Button right=new Button("right");
    private Label hit =new Label("Hit: ");
    private Button move =new Button("Auto move");
    private Button exit =new Button("Exit");
    private int count =217;
    private int count2=200;

    public void initComp(){
        this.setBounds(50,50,1000,850);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setLayout(null);
        sun.setBounds(50,50,50,50);
        sun.setBackground(new Color(226, 216, 94));
        bullet.setBounds(217,500,15,30);
        bullet.setBackground(new Color(226, 23, 39));
        triangle.setBounds(200,600,50,80);
        triangle.setBackground(new Color(84, 130, 53));
        verylong.setBounds(0,700,1000,10);
        verylong.setBackground(new Color(91, 155, 213));
        left.setBounds(250,720,150,50);
        left.setBackground(new Color(91, 155, 213));
        fire.setBounds(450,720,150,50);
        fire.setBackground(new Color(91, 155, 213));
        right.setBounds(650,720,150,50);
        right.setBackground(new Color(91, 155, 213));
        hit.setBounds(50,720,100,50);
//        hit.setBackground(new Color(91, 155, 213));
        move.setBounds(50,780,150,50);
        move.setBackground(new Color(91, 155, 213));
        exit.setBounds(820,780,150,50);
        exit.setBackground(new Color(91, 155, 213));

        this.add(sun);
        this.add(bullet);
        this.add(triangle);
        this.add(verylong);
        this.add(left);
        this.add(fire);
        this.add(right);
        this.add(hit);
        this.add(move);
        this.add(exit);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                count2++;
                bullet.setBounds(count,500,15,30);
                triangle.setBounds(count2,600,50,80);
            }
        });

        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                count2--;
                bullet.setBounds(count,500,15,30);
                triangle.setBounds(count2,600,50,80);
            }
        });

        fire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bullet.setBounds(50,100,15,30);

            }
        });
    }
}
