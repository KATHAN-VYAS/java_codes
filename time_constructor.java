class time{
    int hours;
    int minutes;
    int seconds;
    static  int count;
    {
        count++;
    }
//defautl counstructor
time(){
    hours =0;
    minutes =0;
    seconds =0;
}
//perameterised(overload) constructor

time(int hr,int min,int sec){
    hours =hr;
    minutes =min;
    seconds= sec;
}
    public void print_time_details(){
        System.out.println("Hours:"+hours+"\t minutes"+minutes+"\t seconds"+seconds);
    }
    public void addtime(time t1,time t2){
        System.out.println("Hours:"+(t1.hours+t2.hours)+"\t minutes:"+(t1.minutes+t2.minutes)+
        "\t seconds:"+(t1.seconds+t2.seconds));
    }
    public void subtracttime(time t1,time t2){
        System.out.println("Hours:"+ (t1.hours-t2.hours)+"\t minutes:"+(t1.minutes-t2.minutes)+
        "\t seconds:"+(t1.seconds-t2.seconds));
    
    }
    public time(time t){ // copy constructor
        //this(hours,minutes,seconds)
        hours = t.hours;
        minutes = t.minutes;
        seconds = t.seconds;
    }
    static int countobjects(){
        return count;
    }
}
    class time_constructor{
        public static void main (String[] args){
            time t1 = new time(5,35,45);
            time t2 = new time (1,20,20);
            time t3 = new time (2,40,10);
            time t4 =new time();
            time t5 = t1; // change in t1 changes t5 also
            time t6 = new time(t1); // copy of t1 will be make new t6 so no chnages will change t6 
            t1.print_time_details();
            t2.print_time_details();
            t5.print_time_details();
            t6.print_time_details();
            t3.addtime(t1, t2);
            t4.subtracttime(t1,t3);
            
            System.out.println(time.countobjects());
    }
}
