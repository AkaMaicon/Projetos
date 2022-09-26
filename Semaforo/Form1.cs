using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Semaforo
{
    public partial class Form1 : Form
    {
        int fase = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            pictureBox1.Image = Semaforo.Properties.Resources.semaforo_apagado;

        }

        private void button1_Click(object sender, EventArgs e)
        {
            timer1.Start();
            
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            switch(fase)
            {
                case 0:
                    pictureBox1.Image= Semaforo.Properties.Resources.semaforo_verde;
                    timer1.Interval = 10000;
                    fase = 1;
                    break;

                case 1:
                    pictureBox1.Image = Semaforo.Properties.Resources.semaforo_amarelo;
                    timer1.Interval = 5000;
                    fase = 2;
                    break;

                case 2:
                    pictureBox1.Image = Semaforo.Properties.Resources.semaforo_vermelho;
                    timer1.Interval = 3000;
                    fase = 0;
                    break;
            }
        }
    }
}
