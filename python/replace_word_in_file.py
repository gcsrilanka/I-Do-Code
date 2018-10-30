'''
Replace a word in the file
'''
with open("new.txt", 'r') as f:
    read = f.read()

edit = read.replace('rrr', '(hello)')
print(edit)


with open("new.txt", 'w') as f:
    f.write(edit)

