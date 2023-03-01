public class Convert2 implements
 Convert{
    double usd,bdt,inr,pkr,aud;
    public void usdToAud(double usd){
        this.usd=usd;
        System.out.println("Australian Dollar="+usd*1.49);
    }
    public void audToUsd(double aud){
        this.aud=aud;
        System.out.println("American Dollar="+aud*0.67);
    }
    public  void  usdToPkr(double usd){
        this.usd=usd;
        System.out.println("USD to Pakistani Rupee="+usd*224.56);
    }
    public void pkrToUsd(double pkr){
        this.pkr=pkr;
        System.out.println("PKR to American Dollar=");
    }

}
