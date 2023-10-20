class Fraction(object):
    def __init__(self, num, demon):
        self.num = num
        self.demon = demon

    def __str__(self):
        return str(self.num) + "/" + str(self.demon)

    def __add__(self, other):
        top = self.num * other.demon + self.demon * other.num
        botton = self.demon * other.demon
        return Fraction(top, botton)
    
    def __sub__(self, other):
        top = self.num * other.demon - self.demon * other.num
        botton = self.demon * other.demon
        return Fraction(top, botton)
    
    def __float__(self):
        return self.num / self.demon
        
    
g = Fraction(2, 3)
f = Fraction(2, 3)
z = f + g
w = z - g
print(z)
print(w)
print(float(w))
