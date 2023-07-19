package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class NotePad {

	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("메모장 실행");
			System.out.println("1.메모 작성");
			System.out.println("2.메모 읽기");
			System.out.println("3.메모 수정");
			System.out.println("4.메모 삭제");
			System.out.println("5.메모장 종료");
			
			int selection = scanner.nextInt();
			scanner.nextLine();
			
			switch(selection) {
			case 1:
				createMemo();
				break;
			case 2:
				readMemo();
				break;
			case 3:
				updateMemo();
				break;
			case 4:
				deleteMemo();
				break;
			case 5:
				System.out.println("메모장 종료");
				System.exit(0);
			default:
				System.out.println("잘못된 입력");
			}
		}

	}
	
	private static void createMemo() {
	    try {
	        System.out.println("새로운 메모를 작성 내용을 입력");
	        System.out.println("엔터 두번 입력시 메모 저장");
	        Scanner scanner = new Scanner(System.in);
	        StringBuilder contentBuilder = new StringBuilder();

	        String line;
	        while (!(line = scanner.nextLine()).isEmpty()) {
	            contentBuilder.append(line);
	            contentBuilder.append("\n");
	        }
	        String content = contentBuilder.toString();

	        // 새로운 파일 생성
	        File newMemoFile = getNewMemoFile();
	        BufferedWriter writer = new BufferedWriter(new FileWriter(newMemoFile));
	        writer.write(content);
	        writer.close();

	        System.out.println("메모 저장완료");
	    } catch (IOException e) {
	        System.out.println("메모를 저장하는 중 오류발생");
	        e.printStackTrace();
	    }
	}

	private static File getNewMemoFile() {
	    int memoCount = 1;
	    String memoFileName = "memo" + memoCount + ".txt";
	    File memoFile = new File(memoFileName);

	    while (memoFile.exists()) {
	        memoCount++;
	        memoFileName = "memo" + memoCount + ".txt";
	        memoFile = new File(memoFileName);
	    }

	    return memoFile;
	}

	private static void readMemo() {
	    File memoDirectory = new File("C:\\SJG\\SJG\\java\\workspace\\JavaStudy-20221211-SJG");
	    File[] memoFiles = memoDirectory.listFiles(new FilenameFilter() {
	        @Override
	        public boolean accept(File dir, String name) {
	            return name.startsWith("memo") && name.endsWith(".txt");
	        }
	    });

	    if (memoFiles != null && memoFiles.length > 0) {
	        System.out.println("저장된 메모 목록:");
	        for (File memoFile : memoFiles) {
	            System.out.println(memoFile.getName());
	        }
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("메모의 제목을 입력");
	        System.out.println("예) 제목.txt");
	        String memoTitle = scanner.nextLine();

	        readMemoContent(memoTitle);
	    } else {
	        System.out.println("저장된 메모가 없음");
	    }
	}
	private static void readMemoContent(String memoTitle) {
	    try {
	        File memoFile = new File(memoTitle);

	        if (memoFile.exists()) {
	            BufferedReader reader = new BufferedReader(new FileReader(memoFile));
	            String line;

	            System.out.println("메모 내용:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	            reader.close();
	        } else {
	            System.out.println("해당 제목의 메모 없음");
	        }
	    } catch (IOException e) {
	        System.out.println("메모 읽는 중 오류 발생");
	        e.printStackTrace();
	    }
	}


	private static void updateMemo() {
		try {
			System.out.println("메모 수정 새로운 내용 입력");
			Scanner scanner = new Scanner(System.in);
			String content = scanner.nextLine();
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("memo.txt"));
			bufferedWriter.write(content);
			bufferedWriter.close();
			
			System.out.println("메모 수정 완료");
		}
		catch(IOException e) {
			System.out.println("메모 수정 중 오류 발생");
			e.printStackTrace();
		}
	}
	private static void deleteMemo() {
	    File memoDirectory = new File("C:\\SJG\\SJG\\java\\workspace\\JavaStudy-20221211-SJG");
	    File[] memoFiles = memoDirectory.listFiles(new FilenameFilter() {
	        @Override
	        public boolean accept(File dir, String name) {
	            return name.startsWith("memo") && name.endsWith(".txt");
	        }
	    });

	    if (memoFiles != null && memoFiles.length > 0) {
	        System.out.println("저장된 메모 목록:");
	        for (File memoFile : memoFiles) {
	            System.out.println(memoFile.getName());
	        }
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("메모 제목 입력");
	        System.out.println("예) 제목.txt");
	        String memoTitle = scanner.nextLine();
	        
	        File file = new File(memoTitle);
			
			if(file.delete()) {
				System.out.println("메모 삭제 완료");
			}else {
				System.out.println("삭제 중 오류 발생");
			}
	    } else {
	        System.out.println("저장된 메모가 없음");
	    }
	    
	}
}
