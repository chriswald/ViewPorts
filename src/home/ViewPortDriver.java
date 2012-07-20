package home;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import pkg.ViewPort;

public class ViewPortDriver {

	public static void main(final String[] args) {
		Image img=null;
		try {
			img=Toolkit.getDefaultToolkit().getImage("Desktop.jpg");
		} catch (Exception e) {
			e.printStackTrace();
		}

		ViewPort vp=new ViewPort(new Dimension(200,200), img, "Port");

	}

}
