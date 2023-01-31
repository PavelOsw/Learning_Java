package mx.generation;

public class Variables {
	public static void main(String[] args) {
		
		// (8 bits)
		byte variableTipoByte = 10;
		System.out.println("Byte: " + variableTipoByte);
		System.out.println("MAX byte value: " + Byte.MAX_VALUE);
		System.out.println("MIN byte value: " + Byte.MIN_VALUE);
		
		// (16 bits)
		short variableTipoShort = 777;
		System.out.println("Short: "+ variableTipoShort);
		System.out.println("MAX byte value: " + Short.MAX_VALUE);
		System.out.println("MIN byte value: " + Short.MIN_VALUE);
		
		// (32 bits)
		int variableTipoInt = 1256;
		System.out.println("Integer: "+ variableTipoInt);
		System.out.println("MAX byte value: " + Integer.MAX_VALUE);
		System.out.println("MIN byte value: " + Integer.MIN_VALUE);
		
		// (64 bits)
		long variableTipoLong = 1258;
		System.out.println("Long: "+ variableTipoLong);
		System.out.println("MAX byte value: " + Long.MAX_VALUE);
		System.out.println("MIN byte value: " + Long.MIN_VALUE);
		
		// Las literales numéricas son de tipo Int.
		// Ejemplo: 85452, 0, -26846516
		// Indica la letra L (de preferencia mayúscula) hacemos
		// las literales numéricas de 64 bits.
		long maxValueLong = 2147483648L;
		
		// Las literales numéricas son de tipo Float (32 bits).
		// Nota: las literales de tipo flotante, son de tipo Double
		// Agregando la F (de preferencia mayúscula) hacemos
		// las literales de tipo Float.
		float variableTipoFloat = 21.48F;
		System.out.println("Float: "+ variableTipoFloat);
		System.out.println("MAX byte value: " + Float.MAX_VALUE);
		System.out.println("MIN byte value: " + Float.MIN_VALUE);
		
		double variableTipoDouble = 213.484;
		System.out.println("Double: "+ variableTipoDouble);
		System.out.println("MAX byte value: " + Double.MAX_VALUE);
		System.out.println("MIN byte value: " + Double.MIN_VALUE);
		System.out.println("Respuesta " + ((3.1*10+2.2)/3.5));
	}
}
