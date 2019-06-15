import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tiempo {
	Calendar calendar = new GregorianCalendar();
	private int hour = calendar.get(Calendar.HOUR_OF_DAY);
	private int minute = calendar.get(Calendar.MINUTE);
	private int second = calendar.get(Calendar.SECOND);

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void CambiarHora(int hora, int minuto, int segundo) {
		this.hour = hora;
		this.minute = minuto;
		this.second = segundo;
		System.out.println("\nNueva Hora");
		System.out.println(this.hour+":"+this.minute+":"+this.second);
	}
}
