package aleatorio;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompararString {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Zênite");
		lista.add("Ângston");
		lista.add("amarelo");
		lista.add("Amasiado");
		lista.add("Zebra");
		lista.add("Banana");
		lista.add("baba");
		lista.add("Babá");
		
		Collections.sort(lista, Collator.getInstance());
		System.out.println(lista);

	}

}
