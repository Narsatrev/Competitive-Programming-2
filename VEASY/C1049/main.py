import string

def occurrences(string, sub):
    count = start = 0
    while True:
        start = string.find(sub) + 1
        if start > 0:
            count+=1
        else:
            return count



n =int(input())

for x in range(n):
        x=raw_input
        coins=raw_input

        ttt=occurrences(coins,"TTT")
        tth=occurrences(coins,"TTH")
        tht=occurrences(coins,"THT")
        thh=occurrences(coins,"THH")
        htt=occurrences(coins,"HTT")
        hth=occurrences(coins,"HTH")
        hht=occurrences(coins,"HHT")
        hhh=occurrences(coins,"HHH")

        s=x+' '+ttt+' '+tth+' '+tht+' '+thh+' '+htt+' '+hth+' '+hht+' '+hhh
        print s
