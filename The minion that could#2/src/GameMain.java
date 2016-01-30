import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Properties;

import javax.swing.JFrame;
public class GameMain implements Runnable {
	File configFile = new File("config.properties");
	ProAi proAi = new ProAi();
	LinkedList entites = new LinkedList();
	public static void main (String args[]){
	GameMain Main = new GameMain();
}

	public GameMain(){
    JFrame frame = new JFrame();
    frame.setTitle("The Minion That Could");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setSize(800, 550);
    frame.setResizable(false);
    frame.setVisible(true);
	entites.addLast(proAi);
	}
public String reader (String targit){
	String value = "";
	try {
	    FileReader reader = new FileReader(configFile);
	    Properties props = new Properties();
	    props.load(reader);
	    value = props.getProperty(targit);
	    reader.close();
	} catch (IOException ex) {
	} 
	return value;
}
public void writer (String targit, String value){
	try {
	    Properties props = new Properties();
	    props.setProperty(targit,value);
	    FileWriter writer = new FileWriter(configFile);
	    props.store(writer,"configs");
	    writer.close();
	} catch (IOException ex) {
	}
}

@Override
public void run() {
	
	
}
}
