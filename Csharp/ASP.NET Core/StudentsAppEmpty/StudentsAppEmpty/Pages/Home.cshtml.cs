using Microsoft.AspNetCore.Mvc.RazorPages;
using System.Globalization;

namespace StudentsAppEmpty.Pages
{
    public class HomeModel : PageModel
    {
        public string? DayName { get; set; }

        public void OnGet()
        {
            CultureInfo.DefaultThreadCurrentCulture = new CultureInfo("en-US");
            DayName = DateTime.Now.ToString("dddd");
            ViewData["Title"] = "Home";
        }
    }
}
