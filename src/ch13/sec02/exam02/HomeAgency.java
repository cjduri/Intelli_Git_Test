package ch13.sec02.exam02;

public class HomeAgency implements Rental<Home>{
    @Override
    public Home rent() {
        return new Home();
    }
}
