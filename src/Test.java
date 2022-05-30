import com.joelsonalves.gof.facade.Facade;
import com.joelsonalves.gof.singleton.SingletonEager;
import com.joelsonalves.gof.singleton.SingletonLazy;
import com.joelsonalves.gof.singleton.SingletonLazyHolder;
import com.joelsonalves.gof.strategy.*;

public class Test {

    public static void main(String[] args) {

        /**
         * Singleton
         */

        System.out.println("SingletonLazy");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("\nSingletonEager");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println("\nSingletonLazyHolder");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        /**
         * Strategy
         */

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        System.out.println("\nStrategy");

        Robo robo = new Robo(normal);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        /**
         * Facade
         */

        System.out.println("\nFacade");

        Facade facade = new Facade();
        facade.migrarCliente("Joelson Alves", "00000-000");

    }

}
