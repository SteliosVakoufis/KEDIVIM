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
            //Ginetai automata:
            //if (env.IsDevelopment)
            //{
            //    app.UseDeveloperExceptionPage();
            //}
            //else
            //{
            //    app.UseExceptionHandler("/Error");
            //}
            if (env.IsDevelopment())
            {
                //Enable HTTP Strict Transport security
                // to force all trafic over HTTPS and to
                //prevent user from using untrusted or
                //invalid certificates
                app.UseHsts();
            }

            app.UseRouting();

            //Redirect HTTP requests to HTTPS
            app.UseHttpsRedirection();

            app.UseStaticFiles();

            app.UseEndpoints(endpoints =>
            {
                endpoints.MapRazorPages();
                endpoints.MapGet("/hello", () => "Hello World");
            });
        }
    }
}
