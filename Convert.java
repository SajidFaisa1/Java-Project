public abstract class Convert{
    double usd,bdt,inr,pkr,aud;
    
    public void usdToBdt(double usd){
        this.usd=usd;
        System.out.println("Bangladeshi Taka="+usd*103.26);
    }
    public void bdtToUsd(double bdt){
        this.bdt=bdt;
        System.out.println("American Dollar="+bdt*0.0097);
    }
    public void usdToInr(double usd){
        this.usd=usd;
        System.out.println("Indian Rupee="+usd*82.49);
    }
    public void inrToUsd(double inr){
        this.inr=inr;
        System.out.println("American Dollar="+inr*012);
    }
    public abstract void usdToAud();
    public abstract void audToUsd();
    public abstract void  usdToPkr();
    public abstract void pkrToUsd();

}