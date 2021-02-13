package encadeada;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabio
 */
public class ListaLigada {
	private No inicio;

	public ListaLigada(){
		inicio=null;
	}

	public void AdicionaFinal(int e){
		if (inicio==null){
			No n=new No(e);
			inicio=n;
		}
		else{
			No aux=inicio;
			while(aux.prox!=null){
				aux=aux.prox;
			}
			No n=new No(e);
			aux.prox=n;
		}
	}

	public void AdicionaInicio(int e){
		No n=new No(e);
		n.prox=inicio;
		inicio=n;
	}

	public int RemoveFinal(){
		int r=-1;
		if (inicio==null){
			System.out.println("Lista Vázia");
		}
		else{
			if (inicio.prox==null){
				r=inicio.dado;
				inicio=null;
			}
			else{
				No aux1=inicio;
				No aux2=inicio;

				while(aux1.prox!=null){
					aux2=aux1;
					aux1=aux1.prox;
				}

				r=aux1.dado;
				aux2.prox=null;
			}
		}
		return r;
	}
	
	   public void escolhePosicao(int e, int pos){
	        No novo= new No(e);

	        if(pos==1){  /*CONDIÇÃO DO COMEÇO DO MÉTODO MUDOU, TENDO EM VISTA QUE
	             SEMPRE QUE A POSIÇÃO FOR 1, O ITEM SERÁ ADICIONADO NO INICIO DA LISTA,
	             NÃO IMPORTANDO SE A MESMA SE ENCONTRA VAZIA OU NÃO*/            
	            AdicionaInicio(e);
	        }else{       
	            No aux=inicio;
	            int count=1;
	            
	            while(aux.prox!=null && count<pos-1){
	                aux=aux.prox;
	                count++;
	            }
	            
	            if(count==pos-1){  /*A CONSIÇÃO PARA SE SABER SE É POSSIVEL ADICIONAR
	               O ITEM NA POSIÇÃO DESEJADA PASSOU A SER FORA DO LAÇO */
	                novo.prox=aux.prox;
	                aux.prox=novo;
	            }else{
	                System.out.println("Posição Inválida!");
	            }            
	        }
	    }
	   
	   
	    public int escolheRemove(int pos){
	        int e=-1;
	        int i=1;
	        No aux=inicio;
	        	        
	        if(inicio==null){
	            System.out.println("Lista Vazia!");
	            return e;
	        }    
	        if(pos==1){// NOVA CONDIÇÃO. TODA VEZ QUE A POS FOR 1, O ITEM REMOVIDO SERÁ O PRIMEIRO
	            e=RemoveInicio();
	            return e;
	        }else{           
	            while(aux.prox!=null){
	                aux=aux.prox;
	                i++;
	            }
	            if(pos>i || pos==0){
	                System.out.println("Posição Invalida!");
	                return e;
	            }else if(pos==i){
	                e=RemoveFinal();
	                return e;
	            }else{
	                aux=inicio;
	                No aux2=aux;
	                
	                while(pos>1){
	                    aux2=aux;
	                    aux=aux.prox;
	                    pos--;
	                }
	                e=aux.dado;
	                aux2.prox=aux.prox;
	                return e;
	            }
	        }        
	    }
	 

	public int RemoveInicio(){
		int r=-1;
		if (inicio==null){
			JOptionPane.showMessageDialog(null,"Lista Vázia");
		}
		else{
			r=inicio.dado;
			inicio=inicio.prox;
		}
		return r;
	}

	public String percorre(){
		No aux=inicio;
		String r=" ";
		while(aux!=null){
			r=r+"\n"+aux.dado;
			aux=aux.prox;
		}
		return r;
	}
}
