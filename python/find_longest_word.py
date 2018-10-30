'''
find the longest word in a list
'''

words = ['hi', 'hello', 'how', 'y', 'just']
large = words[0]

for i in words:
    if len(i) > len(large):
        large = i

print(large)
