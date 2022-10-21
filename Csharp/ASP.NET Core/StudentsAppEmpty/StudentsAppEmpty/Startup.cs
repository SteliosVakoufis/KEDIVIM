namespace StudentsApp
{
    public class Startup
    {
        public void ConfigureServices(IServiceCollection services)
        {
            services.AddRazorPages();
        }

        public void Configure(IApplicationBuilder app, IWebHostEnvironment env)
        {
            if (env.IsDevelopment())
            {
                // Enables HTTP Strict Transport security
                // to force all trafic over HTTPS and to
                // prevent user from using untrusted or
                // invalid certificates
                app.UseHsts();
            }

            app.UseRouting();

            // Redirects HTTP requests to HTTPS
            app.UseHttpsRedirection();

            app.UseStaticFiles();

            app.UseEndpoints(ep =>
            {
                ep.MapRazorPages();
            });
        }
    }
}
