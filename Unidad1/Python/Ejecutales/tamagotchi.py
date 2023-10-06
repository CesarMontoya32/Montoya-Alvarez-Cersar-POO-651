import random
import time

class Tamagotchi:
    def __init__(self, nombre):
        self.nombre = nombre
        self.felicidad = 100
        self.hambre = 0
        self.limpieza = 0
        self.salud = 100
        self.edad = 0

    def alimentar(self):
        self.hambre -= 20
        self.felicidad += 10
        self.limpieza += 10

    def limpiar(self):
        self.limpieza -= 30
        self.felicidad += 10

    def jugar(self):
        self.felicidad += 20
        self.hambre += 10
        self.limpieza += 10

    def envejecer(self):
        self.edad += 1
        self.hambre += 10
        self.limpieza += 10
        self.salud -= 5

    def estado_general(self):
        return f"Nombre: {self.nombre}\nEdad: {self.edad}\nFelicidad: {self.felicidad}\nHambre: {self.hambre}\nLimpieza: {self.limpieza}\nSalud: {self.salud}"

def main():
    nombre = input("¡Bienvenido al juego Tamagotchi! ¿Cómo quieres llamar a tu mascota? ")
    mi_tamagotchi = Tamagotchi(nombre)
    
    while mi_tamagotchi.salud > 0:
        print("\n***********************")
        print(mi_tamagotchi.estado_general())
        print("***********************")
        print("¿Qué quieres hacer?")
        print("1. Alimentar")
        print("2. Limpiar")
        print("3. Jugar")
        print("4. Salir del juego")
        
        accion = input("Selecciona una opción: ")
        
        if accion == "1":
            mi_tamagotchi.alimentar()
        elif accion == "2":
            mi_tamagotchi.limpiar()
        elif accion == "3":
            mi_tamagotchi.jugar()
        elif accion == "4":
            print("¡Gracias por jugar!")
            break
        else:
            print("Opción no válida. Inténtalo de nuevo.")
            continue

        mi_tamagotchi.envejecer()

        # Simular eventos aleatorios
        if random.randint(0, 9) == 0:
            print(f"\nOh no, {mi_tamagotchi.nombre} se enfermó!")
            mi_tamagotchi.salud -= 10

        if mi_tamagotchi.hambre >= 100 or mi_tamagotchi.limpieza >= 100:
            print(f"\n{mi_tamagotchi.nombre} ha muerto de descuido. ¡Game Over!")
            break
        
        time.sleep(1)  # Simular el paso del tiempo

if __name__ == "__main__":
    main()

