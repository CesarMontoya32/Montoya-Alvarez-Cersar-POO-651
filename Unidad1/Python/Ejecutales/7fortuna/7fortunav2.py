from tkinter import *
import random

class SieteAfortunado:
    def __init__(self):
        self.crear_interfaz()
    
    def crear_interfaz(self):
        self.ventana = Tk()
        self.ventana.minsize(340, 450)
        self.ventana.geometry('340x450')
        
        self.boton = Button(self.ventana, text='Jugar', command=self.jugar, font='arial 18 bold')
        self.boton.pack()
        
        self.foto = PhotoImage(file=r'dinero.png')
        
        self.campos = [StringVar() for _ in range(3)]
        posicion = 10
        for campo in self.campos:
            label = Label(self.ventana, textvariable=campo, background='white', foreground='black', font='arial 42 bold')
            label.place(x=posicion, y=100, width=100, height=100)
            posicion += 110
        
        self.gano = Label(self.ventana, image=self.foto)  # Label para mostrar la imagen
        self.gano.pack_forget()  # Inicialmente ocultar la imagen
        
        self.ventana.mainloop()

    def generar_numero(self):
        return random.randint(0, 9)

    def jugar(self):
        conteo_sietes = 0  # Contador para los sietes
        for i in range(3):
            valor = self.generar_numero()
            self.campos[i].set(valor)
            if valor == 7:
                conteo_sietes += 1
        
        if conteo_sietes == 3:  # Mostrar la imagen si hay 3 sietes
            self.gano.pack(side=BOTTOM)
        else:
            self.gano.pack_forget()

juego = SieteAfortunado()

