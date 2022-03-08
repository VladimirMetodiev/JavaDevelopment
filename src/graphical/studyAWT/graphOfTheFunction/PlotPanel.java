package graphical.studyAWT.graphOfTheFunction;

import java.awt.*;

public class PlotPanel extends Panel {
    // Референция към обекта на вътрешния клас:
    public Plotter plotter;

    // Вътрешен клас за реализация на графиката на функцията:
    class Plotter {
        // Граници на диапазона за изменение на координатите:
        private double xMin = 0, xMax, yMin = 0, yMax = 1.0;
        // Състояние на превключвателя за показване на мрежата:
        private boolean status;
        // Цвят за графиката:
        private Color colour;
        // Цвят за линиите на мрежата:
        private Color gridColour;

        // Конструктор с аргумент – референция към панела с бутоните
        Plotter(ButtonPanel p) {
            // Взимане на стойността на текстовото поле и преобразуването ѝ в число
            try {
                xMax = Double.parseDouble(p.textField.getText());
            }
            catch (NumberFormatException e) {
                p.textField.setText("10");
                xMax = 10;
            }
            // Определяне състоянието на превключвателя
            status = p.checkboxes[3].getState();
            // Определяне на цвета на линиите за мрежата
            switch (p.choice.getSelectedIndex()) {
                case 0: gridColour = Color.GREEN; break;
                case 1: gridColour = Color.YELLOW; break;
                default: gridColour = Color.GRAY; break;
            }
            // Цвят на линията на графиката
            String name = p.checkboxGroups.getSelectedCheckbox().getLabel();

            if (name.equalsIgnoreCase(" red ")) {
                colour = Color.RED;
            }
            else {
                if (name.equalsIgnoreCase(" blue ")) {
                    colour = Color.BLUE;
                }
                else {
                    colour = Color.BLACK;
                }
            }
        }

        // Метод за определяне на графиката на функцията
        private double function(double x) {
            return (1 + Math.sin(x)) / (1 + Math.abs(x));
        }

        // Метод за четене и запомняне на настройките
        public Plotter remember(ButtonPanel p) {
            return new Plotter(p);
        }

        // Метод за показване на графиката и мрежата
        public void plot(Graphics figure) {
            // Параметри на областта за графиката
            int graphH, graphW, h, w, s = 20;
            graphH = getHeight();
            graphW = getWidth();
            h = graphH - 2 * s;
            w = graphW - 2 * s;
            // Изчистване на областта за графиката
            figure.clearRect(0, 0, graphW, graphH);
            // Индексна променлива и брой линии на мрежата:
            int k, numbers = 10;
            // Цвят на координатните оси - черен
            figure.setColor(Color.BLACK);
            // Показване на координатните оси
            figure.drawLine(s, s, s, h + s);
            figure.drawLine(s, s + h, s + w, s + h);
            // Показване на деленията и числовите стойности на координатните оси
            for (k = 0; k <= numbers; k++) {
                figure.drawLine(s + k * w / numbers, s + h, s + k * w / numbers, s + h + 5);
                figure.drawLine(s - 5, s + k * h / numbers, s, s + k * h / numbers);
                figure.drawString(
                        Double.toString(xMin + k * (xMax - xMin) / numbers), s + k * w / numbers - 5, s + h + 15
                );
                figure.drawString(
                        Double.toString(yMin + k * (yMax - yMin) / numbers), s - 17, s + h - 1 - k * h / numbers
                );
            }
            // Показване на мрежата
            if (status) {
                figure.setColor(gridColour);
                // Показване на линиите на мрежата
                for (k = 1; k <= numbers; k++) {
                    figure.drawLine(s + k * w / numbers, s, s + k * w / numbers, h + s);
                    figure.drawLine(s, s + (k - 1) * h / numbers, s + w, s + (k - 1) * h / numbers);
                }
            }
            // Показване на графиката
            figure.setColor(colour); // Цвят на линията
            // Мащаб по един пиксел за всяка от координатите
            double dX = (xMax - xMin) / w;
            double dY = (yMax - yMin) / h;
            // Променливи за декартовите координати
            double x1, x2, y1, y2;
            // Променливи за координатите в прозореца за графиката
            int h1, h2, w1, w2;
            // Начални стойности
            x1 = xMin;
            y1 = function(x1);
            w1 = s;
            h1 = h + s - (int) Math.round(y1 / dY);
            // Стъпка в пиксели за базовите точки
            int step = 5;
            // Показване на базовите точки и съединяването им с линии
            for (int i = step; i <= w; i += step) {
                x2 = i * dX;
                y2 = function(x2);
                w2 = s + (int) Math.round(x2 / dX);
                h2 = h + s - (int) Math.round(y2 / dY);
                // Линия
                figure.drawLine(w1, h1, w2, h2);
                // Базова точка (на квадрат)
                figure.drawRect(w1 - 2, h1 - 2, 4, 4);
                // Нови стойности за координатите
                x1 = x2;
                y1 = y2;
                w1 = w2;
                h1 = h2;
            }
        }
    }

    // Конструктор с аргументи: координати и размери на панела, референция към панела с бутоните
    PlotPanel(int x, int y, int w, int h, ButtonPanel p) {
        // Създаване на обект на вътрешния клас
        plotter = new Plotter(p);
        // Цвят на фона на панела
        setBackground(Color.WHITE);
        // Размери и разположение на панела
        setBounds(x, y, w, h);
    }

    // Предефиниране на метода за прерисуване на панела
    public void paint(Graphics g) {
        // При прерисуване се извиква методът за показване на графиката
        plotter.plot(g);
    }
}
