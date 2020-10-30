package functionex1;

public class FunctionEx1 {

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001]; // 1���� 10000�̹Ƿ�
		
		for(int i = 1; i < 10001; i++)
		{
			int n = d(i);
			
			if(n<10001)
			{
				check[n] = true; /* ���ο��� ���� d �Լ��� ���� ���ϵ� �� n �� boolean �迭�� �ε����� ����Ͽ� �ش� ��ġ�� true �� �ٲپ� �ִ� ���̴�.
									�̶� �������� �����ֵ��� 1 ���� 10000�����̹Ƿ� 10001 �̻��� ���� �ʿ� ����. */
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int j = 1; j < 10001; j++)
		{
			if(!check[j])  // false �� �ε����� ���
			{
				sb.append(j).append('\n');
			}
		}
		
		System.out.println(sb);

	}
	
	public static int d(int number) {  // ���� ����� 1 ���� 10000���� �˻��� ��, �ش� ���� �����ڷ� �ϴ� ���� ������ �� ���� �Ÿ��� ���̴�.
		// 1 ���� 10000���� �˻��� ��  ���ο��� d �Լ��� ���ڸ� �־�� return �Ǵ� ���� �ش� number�� �����ڷ� �ϴ� ���� ���� �� ���̴�.
		
		int sum = number; /* ���� number ��� ���� �ްԵǸ� number �� �����ڷ� �ϴ� ���� ���Ͻ�ų ���̱� ������ sum �̶� ������ �ϳ� �����Ѵ�. 
							�׸��� �ʱ� ���� number �� �Ѵ�. (���� �������� �� number �� �ʱ�ȭ �ϴ��� �˷��� ���̴�. */
		
		while(number!=0) // �����ѹ��� ã�� ���� �ݺ����� �ۼ����ش�.
		{
			sum = sum + (number % 10); // ù ° �ڸ��� (�ϴ� �� �ڸ����� �����ֱ� ���ؼ� ������ �����ڿ� ������ �����ڷ� 10 ������ number �� �ٿ� �� ���̱� ������ number �� 0 �� �ƴ� �� ���� ��� �ݺ����ش�.)
			number = number/10;	// 10�� ������ ù ° �ڸ��� ���ش�
		}
		
		return sum; // return �� ���� �����ڰ� �ִ� ��, �� ����ϸ� �ȵǴ� �� �̹Ƿ� boolean �迭�� ���� true �� �ٲپ� �ش�.
	}

}