package functionex2;
import java.io.*;

public class FunctionEx2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(hansu(Integer.parseInt(br.readLine())));

	}
	
	public static int hansu(int num) {
		
		int cnt = 0;	// �Ѽ� ī����
	    
		if(num < 100)
		{
			return num;    /* �ռ� ���ߵ��� 1 ~ 99 �� ��� �� �� ��ü�� �����̶�� �ߴ�. ��, ���̽��� num �� 100 ���� ���� ���� ū ��츦 ������.������ ���������� �Է��� 1 ���� 1000 ���� �ۿ� �ȵ��´�.
							  �׸��� num �� 100 ���� �������� num �� return ���ָ� �ȴ�. ��, 86�̶�� ���� �Է¹޴��� 1 ~ 86 ������ ��� �����̱� ������ 86���� ������ �����ϴ� ���̴�. */
		}
	    
		else 
		{
			cnt = 99;  /* �ϴ� 100 �̻��� ���� ������ �Ѽ��� �ּ� ������ 99����. �׷��Ƿ� cnt = 99 �� �ʱ�ȭ ���ش�.�׸��� ���� �߿��� ��. �Է� �� �� �ִ��� 1000�̴�. 
						  �׷��� 1000 �� ������ ���������� �ƴ� �Ӵ��� 1000���� ū ���� �Է¹��� �ʱ� ������ num �� 1000 �� ��� num = 999; �� �����ؾ��Ѵ�. (�� ����ó���� ���ش�.) */
			if(num == 1000)
			{	
				num = 999; // ����ó�� �ʼ�
			}
		}
	    
		for(int i = 100; i <= num; i++)   
		{										/*	���ǹ����� ���Ǹ� �ؾ��� ���� ���������̹Ƿ� �� �ڸ��� ������� ���� ���� ���ؾ� �Ѵ�. 
													���� ���̳ĸ� 135 ��� ���� �� �ڸ����� ������ ���Ϸ��� ���� �ڸ����� ���ʴ�� ���ų�, ���� �ڸ����� ���ʴ�� �����Ѵٴ� ���̴�.
													��, (1-3), (3-5) �� �ϰų�, (5-3), (3-1) �� �϶���ǹ̴�. */
			
			int hun = i / 100;	// ���� �ڸ���
			int ten = (i / 10) % 10;	// ���� �ڸ���
			int one = i % 10;
            
			if((hun - ten) == (ten - one)) // �� �ڸ����� ������ �̷��
			{	
				cnt++;
			}
		}
		
		return cnt;
		
	}

}