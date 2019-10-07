package betterlife;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String longtext = "피스타치오:33:취미는 코딩:특기는 그림그리기";
		String trimedArray[] = longtext.split(":");
		
		System.out.println(trimedArray[2]);
	}

}
