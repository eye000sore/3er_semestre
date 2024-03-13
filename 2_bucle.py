def valor(ingresos, costo_casa):
    if ingresos>=80000:
        pie_casa = costo_casa*0.15
        resto = costo_casa - pie_casa
        cuota_mnsl = resto/120
    elif ingresos<80000:
        pie_casa = costo_casa*0.30
        resto=costo_casa - pie_casa
        cuota_mnsl = resto/84
    return pie_casa, cuota_mnsl

while True:
    print("\nMenú__________")
    print("1.- Calcular pie y cuota mensual de la vivienda")
    print("Salir del programa")
    opcion = int(input("Ingrese una opcion VALIDA: "))
    if opcion == 1:
        ingresos = int(input("\nIngrese los ingresos del cliente: "))
        costo_casa = int(input("Ingrese el valor de la vivienda: "))
        print(f"Pie de la vivienda - cuota mensual: {valor(ingresos, costo_casa)}")
    else:
        break