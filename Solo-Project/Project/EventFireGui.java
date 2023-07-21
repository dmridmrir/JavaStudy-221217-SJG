package Project;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EventFireGui extends JFrame{
	private static final long serialVersionUID = -711163588504124217L;
	
	public EventFireGui() {
		super("Event Firer");
		
		setBounds(100, 100, 300, 200);
//		창의 위치와 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		닫기 버튼 클릭시 이벤트 설정
		
		Container contentPane = this.getContentPane();
		JPanel pane = new JPanel();
		JButton buttonStart = new JButton("Start");
//		버튼 생성
		final JTextField textPeriod = new JTextField(5);
//		텍스트 입력란
		JLabel labelPeriod = new JLabel("Input period : ");
//		라벨 추가
		JCheckBox checknoxIsRandom = new JCheckBox("Fire randomly");
		
		checknoxIsRandom.addChangeListener(new ChangeListener() {
//			상태가 변하면 처리할 리스너 추가
			@Override
			public void stateChanged(ChangeEvent e) {
				if(((JCheckBox)e.getSource()).isSelected()) {
//					getSource = 이벤트가 일어난 개체 리턴
//					isSelected = 체크박스의 체크 여부
					textPeriod.setText("Random");
//					텍스트 필드 값 설정
					textPeriod.setEnabled(false);
//					개체의 활성/비활성화 설정
				}else {
					textPeriod.setText("");
					textPeriod.setEnabled(true);
				}
			}
		});
		
		buttonStart.setMnemonic('S');
//		단축키 설정
		  
		pane.add(buttonStart);
		pane.add(labelPeriod);
		pane.add(textPeriod);
		pane.add(checknoxIsRandom);
		contentPane.add(pane);
//		JPanel.add = 프로그램에 추가
		  
		setVisible(true);
//		보이도록 설정
	}
}
