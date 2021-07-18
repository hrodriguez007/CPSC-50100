
public class Lab1Ex2 {

	public static void main(String[] args) {
		double quizScore1 = 84;
		double quizScore2 = 91; 
		double quizScore3 = 75;
		double testScore1 = 88;
		double testScore2 = 93;
		double quizScoreAvg = (quizScore1 + quizScore2 + quizScore3)/3;
		double testScoreAvg = (testScore1 + testScore2)/2;
		
		quizScore1=quizScore2=quizScore3=quizScoreAvg;
		testScore1=testScore2=testScoreAvg;
		
		
		System.out.println("quizScore1 :"+quizScore1);
		System.out.println("quizScore2 :"+quizScore2);
		System.out.println("quizScore3 :"+quizScore3);
		System.out.println("testScore1 :"+testScore1);
		System.out.println("testScore2 :"+testScore2);
	}

}
