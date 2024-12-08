import javax.swing.JOptionPane;

public class ejercicioArreglos {
    public static void main(String[] args) {
        
        String Materia[] = {"CALCDIF", "MATEDIS", "FUNDPRO", "FUNDINV", "QUIMICA", "DESSUS"};
       String Encabezado[]={"Materia","U1","U2","U3","U4","U5","promedio"};
       byte calificaciones[][]=new byte[6][5];
       byte x,y=0;
      
       //ingresa calificasiones de las materias
       for(x=0;x<=5;x++){//filas
            for(y=0;y<5;y++){//columnas
          calificaciones[x][y]=Byte.parseByte(JOptionPane.showInputDialog(" Ingresa Calificasiones de "+Materia[x]+" UNIDAD "+(y+1))); 
            }
    }
    
//impresion de calificasiones
for (x=0;x<=5;x++){
System.out.printf(Encabezado[x]+"\t");
    }System.out.println("\t");
      for(x=0;x<=5;x++){//filas
          System.out.print(Materia[x]+"\t");
      for(y=0;y<5;y++){//columnas
          System.out.print(calificaciones[x][y]+"\t");
      }
          System.out.println();
}
      

}
}
