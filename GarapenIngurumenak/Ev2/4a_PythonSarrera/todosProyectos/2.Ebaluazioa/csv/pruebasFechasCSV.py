#archivo de prueba para conocer el formato de datos de tipo fechas, meses...

from datetime import datetime
#import datetime


print(datetime.now().date())
print('----')
print(datetime.now().strftime('%d/%m/%Y'))
print('----')
print(datetime.now().strftime('%Y/%m/%d/%H/%M/%S'))
print('----')
print(datetime.now())
print('----')
print(datetime.now())
print('------------')

now = str(datetime.now())
now = now.replace("-","/").replace(" ", " and ")
print('Ahora mismo es: ' + now)

#enlaces info:
#https://stackoverflow.com/questions/55259313/print-the-local-date-and-time-in-python