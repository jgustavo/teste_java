import java.util.Calendar;

public class ComparaPrimitivoObjeto {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		Long timeInMillis = c.getTimeInMillis();

		Long sum = 0L; //MUDAR Long para long e observar o resultado
						// será 10 x mais rápido
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		Calendar instance = Calendar.getInstance();

		long timeInMillis2 = instance.getTimeInMillis();
		
		System.out.println(timeInMillis2-timeInMillis);
		
		
	}

}
