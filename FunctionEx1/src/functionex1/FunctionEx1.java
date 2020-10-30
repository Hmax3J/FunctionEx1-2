package functionex1;

public class FunctionEx1 {

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001]; // 1부터 10000이므로
		
		for(int i = 1; i < 10001; i++)
		{
			int n = d(i);
			
			if(n<10001)
			{
				check[n] = true; /* 메인에서 보면 d 함수에 의해 리턴된 수 n 을 boolean 배열의 인덱스로 사용하여 해당 위치를 true 로 바꾸어 주는 것이다.
									이때 문제에서 나와있듯이 1 부터 10000까지이므로 10001 이상의 수는 필요 없다. */
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int j = 1; j < 10001; j++)
		{
			if(!check[j])  // false 인 인덱스만 출력
			{
				sb.append(j).append('\n');
			}
		}
		
		System.out.println(sb);

	}
	
	public static int d(int number) {  // 구현 방식은 1 부터 10000까지 검사한 뒤, 해당 수를 생성자로 하는 수가 있으면 그 수를 거르는 것이다.
		// 1 부터 10000까지 검사할 때  메인에서 d 함수로 숫자를 넣어보며 return 되는 수는 해당 number를 생성자로 하는 수로 구성 할 것이다.
		
		int sum = number; /* 먼저 number 라는 수를 받게되면 number 을 생성자로 하는 수를 리턴시킬 것이기 때문에 sum 이란 변수를 하나 생성한다. 
							그리고 초기 값은 number 로 한다. (이후 과정에서 왜 number 로 초기화 하는지 알려줄 것이다. */
		
		while(number!=0) // 셀프넘버를 찾기 위한 반복문을 작성해준다.
		{
			sum = sum + (number % 10); // 첫 째 자리수 (일단 각 자리수를 더해주기 위해서 나머지 연산자와 나눗셈 연산자로 10 단위씩 number 을 줄여 갈 것이기 때문에 number 가 0 이 아닐 때 까지 계속 반복해준다.)
			number = number/10;	// 10을 나누어 첫 째 자리를 없앤다
		}
		
		return sum; // return 된 수는 생성자가 있는 수, 즉 출력하면 안되는 수 이므로 boolean 배열을 통해 true 로 바꾸어 준다.
	}

}