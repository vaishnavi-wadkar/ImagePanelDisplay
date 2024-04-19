//draw images on pannel
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;

class MyPanel extends Panel
{
	Image img;
	MyPanel()
	{
		super();
	}
	void setImage(Image i)
	{
		img=i;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,0,0,this);
	}
}

public class Frm19 extends Frame
{
	Image img;
	MyPanel pan;
	Frm19()
	{
		super("Image on Panel");
		try
		{
			img=(Image)ImageIO.read(new File("D:\\java2223\\img0.jpg"));
		}
		catch(Exception e){}
		pan=new MyPanel();
		add(pan,BorderLayout.CENTER);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		pan.setImage(img);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		Frm19 a=new Frm19();
	}
}