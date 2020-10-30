package functionex2;
import java.io.*;

public class FunctionEx2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(hansu(Integer.parseInt(br.readLine())));

	}
	
	public static int hansu(int num) {
		
		int cnt = 0;	// 한수 카운팅
	    
		if(num < 100)
		{
			return num;    /* 앞서 말했듯이 1 ~ 99 의 경우 그 수 자체가 수열이라고 했다. 즉, 케이스를 num 이 100 보다 작은 경우와 큰 경우를 나눈다.어차피 문제에서의 입력은 1 에서 1000 까지 밖에 안들어온다.
							  그리고 num 이 100 보다 작을경우는 num 을 return 해주면 된다. 즉, 86이라는 수를 입력받더라도 1 ~ 86 까지는 모두 수열이기 때문에 86개의 수열이 존재하는 것이다. */
		}
	    
		else 
		{
			cnt = 99;  /* 일단 100 이상의 수가 들어오면 한수의 최소 개수는 99개다. 그러므로 cnt = 99 로 초기화 해준다.그리고 가장 중요한 것. 입력 값 중 최댓값은 1000이다. 
						  그런데 1000 은 어차피 등차수열도 아닐 뿐더러 1000보다 큰 수는 입력받지 않기 때문에 num 이 1000 일 경우 num = 999; 로 변경해야한다. (즉 예외처리를 해준다.) */
			if(num == 1000)
			{	
				num = 999; // 예외처리 필수
			}
		}
	    
		for(int i = 100; i <= num; i++)   
		{										/*	조건문에서 주의를 해야할 것이 등차수열이므로 각 자릿수 순서대로 차이 값을 구해야 한다. 
													무슨 말이냐면 135 라는 수의 각 자릿수의 공차를 구하려면 백의 자리부터 차례대로 빼거나, 일의 자리부터 차례대로 빼야한다는 것이다.
													즉, (1-3), (3-5) 를 하거나, (5-3), (3-1) 을 하라는의미다. */
			
			int hun = i / 100;	// 백의 자릿수
			int ten = (i / 10) % 10;	// 십의 자릿수
			int one = i % 10;
            
			if((hun - ten) == (ten - one)) // 각 자릿수가 수열을 이루면
			{	
				cnt++;
			}
		}
		
		return cnt;
		
	}

}