package references;

public class Morning0226 {
	public static void main(String[] args) {
		String[] names = {"임성원", "정준영", "도왕락" };
		int[] scores = { 88, 89, 90 };
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " 점수 => " + scores[i]);
		}
		
		//향상된 for문.
		for(String name : names) {
			System.out.println(name);
		}
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + sum/3.0);
		
//		arrayCopy();
//		morning0226();

	}
	
	public static void arrayCopy() {
		int[] oldAry = { 45, 55, 67 };
		int[] newAry = new int[3];
		for(int i = 0; i<oldAry.length; i++) {
			newAry[i] = oldAry[i];
			System.out.println(newAry[i]);
		}
		
		int[] newAry2=  new int[5];
		System.arraycopy(newAry, 1, newAry2, 1, 2);
		System.out.println(newAry2[0]);
		System.out.println(newAry2[1]);
		System.out.println(newAry2[2]);
		System.out.println(newAry2[3]);
		System.out.println(newAry2[4]);
	}

	public static void morning0226() {
		int[] engScores = new int[3];
		int[] mathScores = new int[3];

		for (int i = 0; i < 3; i++) {
			engScores[i] = (int) (Math.random() * 100) + 1;
			mathScores[i] = (int) (Math.random() * 100) + 1;
		}
		
		int engSum = 0;
		int mathSum = 0;
		for (int i = 0; i < 3; i++) {
			engSum += engScores[i];
			mathSum += mathScores[i];
		}
//		double engAvg = 0.23*10.0;
//		double mathAvg = 0.23/0.1;
		double engAvg = (engSum * 10 / 3) / 10.0;
		double mathAvg = (mathSum * 10 / 3) / 10.0;
//		double engAvg = (engSum*10/3)*0.1000000002;
//		double engAvg = (engSum*10/3)/10.0000000002;
		System.out.println("영어평균: " + engAvg + " / 수학평균: " + mathAvg);
		
//		int[][] scores = new int[2][];
//		scores[0] = new int[] { 90, 88, 87 };
//		scores[1] = new int[] { 88, 90 };

		int[][] scores = { { 90, 88, 87 }, { 88, 90, 92 } };
		double avg = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			if (i == 0) {
				avg = sum * 10 / scores[i].length / 10.0;
				System.out.println("영어의 평균: " + avg);
			} else if (i == 1) {
				avg = sum * 10 / scores[i].length / 10.0;
				System.out.println("수학의 평균: " + avg);
			}

		}

	}

}
