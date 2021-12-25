import java.time.DayOfWeek;
import java.time.LocalDate;

public class KoduÜlesanne {
    private LocalDate date;

    public KoduÜlesanne(int päev, int kuu, int aasta) {
        if (LocalDate.of(aasta, kuu, päev).getDayOfWeek()==DayOfWeek.SATURDAY||LocalDate.of(aasta, kuu, päev).getDayOfWeek()==DayOfWeek.SUNDAY)
            throw new IllegalArgumentException("ebasobiv kuupäev:"+päev+"."+kuu+"."+aasta);
        this.date = LocalDate.of(aasta, kuu, päev);
    }

    public KoduÜlesanne(LocalDate date) {
        if (date.getDayOfWeek() == DayOfWeek.SATURDAY ||date.getDayOfWeek() ==DayOfWeek.SUNDAY)
            throw new IllegalArgumentException("ebasobiv kuupäev:"+date.getDayOfWeek()+"."+date.getMonth()+"."+date.getYear());
        this.date = date;
    }

    public void setDate(LocalDate date) {
        if (date.getDayOfWeek() == DayOfWeek.SATURDAY ||date.getDayOfWeek() ==DayOfWeek.SUNDAY)
            throw new IllegalArgumentException("ebasobiv kuupäev:"+date.getDayOfWeek()+"."+date.getMonth()+"."+date.getYear());
        this.date = date;
    }

    public void setDate(int päev, int kuu, int aasta) {
        if (LocalDate.of(aasta, kuu, päev).getDayOfWeek()== DayOfWeek.SATURDAY ||LocalDate.of(aasta, kuu, päev).getDayOfWeek()==DayOfWeek.SUNDAY)
            throw new IllegalArgumentException("ebasobiv kuupäev:"+päev+"."+kuu+"."+aasta);
        this.date = LocalDate.of(aasta, kuu, päev);
    }

    public LocalDate getDate() {
        return date;
    }

    public static void main(String[] args) {
        KoduÜlesanne päev1 = new KoduÜlesanne(9,5,1978);
        System.out.println(päev1.date);
        KoduÜlesanne päev2 = new KoduÜlesanne(24,4,2021);

    }
}
