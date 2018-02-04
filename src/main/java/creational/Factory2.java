package creational;

import java.util.Calendar;

interface Worker {

}

interface Workerfactory {
      Worker getWorder();
}

class Carpenter implements Worker {
    public Carpenter(String s, long l) {

    }
}

class Welder implements Worker {
}

class CarpenterFactory implements  Workerfactory{
    public  Worker getWorder() {
        int sdalary = 2;
        long date = Calendar.getInstance().getTimeInMillis();
        return new Carpenter("car[enter", sdalary * date);
    }
}
// this definition is valid in itself but we  can either create multiple factorieds for different types of worker or have a switch case
//to figure out which worker to return so  we are iusimng interface here

class WeldorFactory implements  Workerfactory{
    public  Welder getWorder() {

        return new Welder();
    }


}
