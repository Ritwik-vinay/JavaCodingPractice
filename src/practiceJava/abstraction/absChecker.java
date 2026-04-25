package practiceJava.abstraction;

public class absChecker {
    static void main(String[] args) {
        browser br= new Chrome();
        br.launchBrowser();
        br.exitBrowser();
    }
}
class Chrome extends browser{
    @Override
    public void launchBrowser(){
        System.out.println("Chrome Starts");
    }
    @Override
    public void exitBrowser(){
        System.out.println("Exit Browser");
    }
}
abstract class  browser{
    public abstract void launchBrowser();
    public abstract void exitBrowser();

}
