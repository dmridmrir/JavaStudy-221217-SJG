package Project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class NotePad extends JFrame{
	JPanel panel;
	JFrame fr;
	JButton save, saveAs, read, delete;
	JTextArea textArea;
	
	public NotePad() {
		setLayout(null);
		setTitle("NOTE PAD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 700);
		setVisible(true);
		CreatePanel();
	}
	public void CreatePanel() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 600 , 700);
		
		textArea = new JTextArea();
		JScrollPane jScrollPane = new JScrollPane(textArea);
		jScrollPane.setBounds(50, 50, 500, 400);
		
		
		save = new JButton("메모 저장");
		read = new JButton("메모 읽기");
		delete = new JButton("메모 삭제");
		save.setBounds(45, 500, 150, 50);
		read.setBounds(225, 500, 150, 50);
		delete.setBounds(405, 500, 150, 50);
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int memocount = 1;
				String memoname = "memo"+memocount+".txt";
				File memoFile = new File(memoname);
				while(memoFile.exists()) {
					memocount++;
					memoname = "memo" + memocount+".txt";
					memoFile = new File(memoname);
				}
				
				filesave(memoFile);
				textArea.setText(null);
				textArea.setText("파일저장 완료");
			}
		});
		read.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
				File dir = new File("./");
				File[] memofiles = dir.listFiles(new FilenameFilter() {
					
					@Override
					public boolean accept(File dir, String name) {
						return name.endsWith(".txt");
					}
				});
				if(memofiles != null && memofiles.length>0) {
					textArea.setText("저장된 메모 목록");
					textArea.append("\n");
					for(File memofile:memofiles) {
						textArea.append(memofile.getName());
						textArea.append("\n");
					}
				}
			}
		});
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});


		panel.add(jScrollPane);
		panel.add(save);
		panel.add(read);
		panel.add(delete);
		
		add(panel);
	}

	public static void main(String[] args) {
		NotePad notepad = new NotePad();
	}
	private void filesave(File f) {
		try {
			PrintStream ps = new PrintStream(f);
			ps.println(textArea.getText());
			ps.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
