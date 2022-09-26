using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form3 : Form
    {
        DateTime inicio, fim;
        public Form3()
        {
            InitializeComponent();
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {
            
        }

        private void panel2_Paint(object sender, PaintEventArgs e)
        {
            
        }

        private void panel3_Paint(object sender, PaintEventArgs e)
        {
            
        }

        private void label1_Click(object sender, EventArgs e)
        {
            
        }

        private void panel1_Click(object sender, EventArgs e)
        {
            inicio = DateTime.Now;
            timer1.Start();
        }

        private void panel2_Click(object sender, EventArgs e)
        {
            timer1.Stop();
        }

        private void panel3_Click(object sender, EventArgs e)
        {
            label1.Text = "00:00:00";
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            fim = DateTime.Now;
            TimeSpan dif = fim.Subtract(inicio);
            label1.Text = dif.ToString("hh\\:mm\\:ss");
        }
    }
}
