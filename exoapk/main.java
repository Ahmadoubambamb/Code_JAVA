
public class Division{
int tab[];
int taille;
int n;
Division(int x,int y){
this.n = x;
this.taille = y;
  tab = new int[taille];
  for(int i=0;i<taille-3;)
   tab[i] = i++;
   tab[taille-2] = 0;
   tab[taille-1] = 0;
}
public void division(){
 for(int i = 0;i < taille; i++){
   if(tab[i] == 0){
    System.out.println("erreur de division pour le "+ i + "eme element");
   }
   else
   System.out.println("la division de "+n +" avec "+ +tab[i] + " donne :"+n/tab[i]);
 }
}
public static void main(String arg[]){
  int n = 54 , t = 9;
  Division div = new Division(n,t);
  div.division();
 }
}


