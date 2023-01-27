package Conversor;

public class Conversor {

    public static double metroPes(double metro){
        double pes = metro*10.76;
        return pes;

    }
    public static double peCentimetro (double pe){
        double cm = pe*929;
        return cm;
    }
    public static double milhaAcres (double milha){
        double acre = milha*640;
        return acre;
    }

}

/*Escreva	a	classe	ConversaoDeUnidadesDeArea	com	métodos	estáticos
para	conversão	das	unidades	de	área	segundo	a	lista	abaixo.
• 1	metro	quadrado	=	10.76	pés	quadrados
• 1	pé	quadrado	=	929	centímetros	quadrados
• 1	milha	quadrada	=	640	acres
		*/
