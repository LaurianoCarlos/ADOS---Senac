# ADOS---Senac
Ados da faculdade - Análise e desenvolvimento de sistemas
 ## Atividade 01
Dados os métodos de ordenação a seguir, escreva um projeto java que
implemente o padrão Strategy. O seu projeto deve eliminar a necessidade das
estruturas de if/else ou switch/case na classe principal (classe cliente) e
também manter em classes separadas (classes específicas), os algoritmos de
ordenação (veja-os a seguir). Escreva uma classe de contexto (Cliente) que
possibilite ao usuário escolher, via teclado, o algoritmo desejado. Não
esqueça de tratar a exceção gerada quando usuário escolher um algoritmo
que não existe.

### Metodo Insertion
```
public void insertion(int[] v){
 int i,j;
 int temp;
  for(i=1;i<v.length;i++){
  temp=v[i];
  j=i;
   while(j>0 && v[j-1]>=temp){
  v[j]=v[j-1];
  j--;
 }
 v[j]=temp;
 }
}
```
### Metodo Selection
```
public void selection(int[] v) {
 int i,j,min,aux;
 for(i=0;i<v.length-1;i++){
  min=i;
  for(j=i+1;j<v.length;j++)
   if(v[j]<v[min])
    min=j;
    aux=v[i];
    v[i]=v[min];
    v[min]=aux;
  }
}
```

### Metodo Bubble
```
public void bubble(int[] v){
  int i,j;
  int temp;
  for(j=0;j<v.length-1;j++)
    for(i=0;i<v.length-1-j;i++)
      if(v[i]>v[i+1]){
      temp=v[i];
      v[i]=v[i+1];
      v[i+1]=temp;
  }
}
```
