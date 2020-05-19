hosts = ["Dolores", "Teddy"]
ParkInfo = {
	'Teddy' : 'Dolores',
	'Maeve' : 'Hector' , 
	'Bernard' : 'Threasa',
}

print("The hosts in our park being studied are: ")
for host in ParkInfo.keys():
	print(host.title())	

for host in ParkInfo.keys():	
	if host in hosts:
		print("Oh, let's find out who", host, "is in love with...",
			"It's", ParkInfo[host], "!")

for host, lover in ParkInfo.items():
	print(host.title(), "is in love with", lover.title(), ".")

