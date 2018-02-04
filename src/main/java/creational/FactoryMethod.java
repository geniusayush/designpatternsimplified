package creational;

abstract class   HiringManager {
    /**
     * this method is used when u have a  instantion and that has to be decided at runtime .
     *
     */

    Interviewer person;
    public void takeInterviews(){
        person.takeInterview();
    }

    abstract Interviewer shedulePanel();


 }

 class  techManager extends  HiringManager {
    /**
     * this method is used when u have a  instantion and that has to be decided at runtime .
     *
     */

    Interviewer person;
    public void takeInterviews(){
        person.takeInterview();
    }

     Interviewer shedulePanel(){
        return new DEveloper();
     }


}
  interface Interviewer {
      public void takeInterview() ;
  }

  class DEveloper implements Interviewer{
      public void takeInterview() {
          System.out.println("tech interview");
      }
  }

 class HR implements Interviewer{
     public void takeInterview() {
         System.out.println("hr interview");
     }
 }