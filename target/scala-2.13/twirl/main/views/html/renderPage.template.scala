
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml

object renderPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[meerkat.PageGenerator.Article],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(articles: List[meerkat.PageGenerator.Article]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href='./public/stylesheets/plugins.css' rel="stylesheet" type="text/css" />
<link href='./public/stylesheets/style.css' rel="stylesheet" type="text/css"/>
<style type="text/css">
#freecssfooter"""),format.raw/*12.15*/("""{"""),format.raw/*12.16*/("""display:block;width:100%;padding:120px 0 20px;overflow:hidden;background-color:transparent;z-index:5000;text-align:center;"""),format.raw/*12.138*/("""}"""),format.raw/*12.139*/("""
"""),format.raw/*13.1*/("""#freecssfooter div#fcssholder div"""),format.raw/*13.34*/("""{"""),format.raw/*13.35*/("""display:none;"""),format.raw/*13.48*/("""}"""),format.raw/*13.49*/("""
"""),format.raw/*14.1*/("""#freecssfooter div#fcssholder div:first-child"""),format.raw/*14.46*/("""{"""),format.raw/*14.47*/("""display:block;"""),format.raw/*14.61*/("""}"""),format.raw/*14.62*/("""
"""),format.raw/*15.1*/("""#freecssfooter div#fcssholder div:first-child a"""),format.raw/*15.48*/("""{"""),format.raw/*15.49*/("""float:none;margin:0 auto;"""),format.raw/*15.74*/("""}"""),format.raw/*15.75*/("""
"""),format.raw/*16.1*/("""</style><script async="" src="../css/analytics.js"></script><script type="text/javascript" async="" src="../css/bsa.js"></script></head>
<body>
<script type="text/javascript">
(function()"""),format.raw/*19.12*/("""{"""),format.raw/*19.13*/("""
  """),format.raw/*20.3*/("""var bsa = document.createElement('script');
     bsa.type = 'text/javascript';
     bsa.async = true;
     bsa.src = '//s3.buysellads.com/ac/bsa.js';
  (document.getElementsByTagName('head')[0]||document.getElementsByTagName('body')[0]).appendChild(bsa);
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/(""")();
</script>
<div id="preloader" style="display: none;"><img class="preloader" src="../css/loader.gif" alt="website template image" style="display: none;"></div>
<div id="wrapper">
  <div class="collapse top-search" id="collapseExample">
    <div class="card card-block">
      <div class="newsletter-widget text-center">
        <form action="https://www.free-css.com/assets/files/free-css-templates/preview/page243/cloapedia/#" method="post" class="form-inline">
          <input type="text" class="form-control" placeholder="What you are looking for?">
          <button type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>
        </form>
      </div>
    </div>
  </div>
  <div class="header-section">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="logo"><a ><img src="../css/logo.png" alt="website template image"></a></div>
        </div>
      </div>
    </div>
  </div>
  <header class="header">
    <div class="container">
      <nav class="navbar navbar-inverse navbar-toggleable-md">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#cloapediamenu" aria-controls="cloapediamenu" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>

      </nav>
    </div>
  </header>
  <section class="section first-section">
    <div class="container-fluid">
      <div class="masonry-blog clearfix">
        <div class="left-side">
          <div class="masonry-box post-media"><img src="""),_display_(/*60.57*/{articles(0).image}),format.raw/*60.76*/(""" """),format.raw/*60.77*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="">"""),_display_(/*64.35*/{articles(0).headline}),format.raw/*64.57*/("""</a></h4>
                  <small></small><small></small></div>
              </div>
            </div>
          </div>
        </div>
        <div class="center-side">
          <div class="masonry-box post-media"><img src="""),_display_(/*71.57*/{articles(1).image}),format.raw/*71.76*/(""" """),format.raw/*71.77*/("""style="max-width:47%;max-height:47%;object-fit:cover;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="">"""),_display_(/*75.35*/{articles(1).headline}),format.raw/*75.57*/("""</a></h4>
                  <small></small></div>
              </div>
            </div>
          </div>
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*80.67*/{articles(2).image}),format.raw/*80.86*/(""" """),format.raw/*80.87*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="">"""),_display_(/*84.35*/{articles(2).headline}),format.raw/*84.57*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*89.67*/{articles(3).image}),format.raw/*89.86*/(""" """),format.raw/*89.87*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="">"""),_display_(/*93.35*/{articles(3).headline}),format.raw/*93.57*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="right-side hidden-md-down">
          <div class="masonry-box post-media"><img src="""),_display_(/*100.57*/{articles(4).image}),format.raw/*100.76*/(""" """),format.raw/*100.77*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="">"""),_display_(/*104.35*/{articles(4).headline}),format.raw/*104.57*/("""</a></h4>
                  <small></small></div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
   <footer class="footer">
    
  </footer>
  <div class="dmtop" style="bottom: -100px;">Scroll to Top</div>
</div>
<script src="../css/jquery.min.js"></script>
<script src="../css/tether.min.js"></script>
<script src="../css/bootstrap.min.js"></script>
<script src="../css/custom.js"></script>
<div id="freecssfooter">
  <div id="fcssholder">
    <div id="bsap_2365" class="bsarocks bsap_b893e54e42ad5b76e7b252f59be18e67"></div>
  </div>
</div>
<script type="text/javascript">
var gaProperty = 'UA-120201777-1';var disableStr = 'ga-disable-' + gaProperty;if (document.cookie.indexOf(disableStr + '=true') > -1) """),format.raw/*128.135*/("""{"""),format.raw/*128.136*/("""window[disableStr] = true;"""),format.raw/*128.162*/("""}"""),format.raw/*128.163*/("""
"""),format.raw/*129.1*/("""function gaOptout()"""),format.raw/*129.20*/("""{"""),format.raw/*129.21*/("""document.cookie = disableStr + '=true; expires=Thu, 31 Dec 2045 23:59:59 UTC; path=/';window[disableStr] = true;alert('Google Tracking has been deactivated');"""),format.raw/*129.179*/("""}"""),format.raw/*129.180*/("""
"""),format.raw/*130.1*/("""(function(i,s,o,g,r,a,m)"""),format.raw/*130.25*/("""{"""),format.raw/*130.26*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*130.76*/("""{"""),format.raw/*130.77*/("""(i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*130.112*/("""}"""),format.raw/*130.113*/(""",i[r].l=1*new Date();a=s.createElement(o),m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)"""),format.raw/*130.234*/("""}"""),format.raw/*130.235*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');ga('create', 'UA-120201777-1', 'auto');ga('set', 'anonymizeIp', true);ga('send', 'pageview');
</script>

</body>
</html>
"""))
      }
    }
  }

  def render(articles:List[meerkat.PageGenerator.Article]): play.twirl.api.HtmlFormat.Appendable = apply(articles)

  def f:((List[meerkat.PageGenerator.Article]) => play.twirl.api.HtmlFormat.Appendable) = (articles) => apply(articles)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-16T13:46:06.765568
                  SOURCE: /home/leon/projects/meerkat/meerkat-play/app/views/renderPage.scala.html
                  HASH: 1fe209f9ec69d52b648f87deb20145fa4efdec47
                  MATRIX: 600->1|741->49|768->50|1238->492|1267->493|1418->615|1448->616|1476->617|1537->650|1566->651|1607->664|1636->665|1664->666|1737->711|1766->712|1808->726|1837->727|1865->728|1940->775|1969->776|2022->801|2051->802|2079->803|2294->990|2323->991|2353->994|2635->1249|2663->1250|4252->2812|4292->2831|4321->2832|4589->3073|4632->3095|4886->3322|4926->3341|4955->3342|5238->3598|5281->3620|5481->3793|5521->3812|5550->3813|5818->4054|5861->4076|6044->4232|6084->4251|6113->4252|6381->4493|6424->4515|6661->4724|6702->4743|6732->4744|7001->4985|7045->5007|7846->5778|7877->5779|7933->5805|7964->5806|7993->5807|8041->5826|8071->5827|8259->5985|8290->5986|8319->5987|8372->6011|8402->6012|8481->6062|8511->6063|8576->6098|8607->6099|8758->6220|8789->6221
                  LINES: 14->1|19->2|20->3|29->12|29->12|29->12|29->12|30->13|30->13|30->13|30->13|30->13|31->14|31->14|31->14|31->14|31->14|32->15|32->15|32->15|32->15|32->15|33->16|36->19|36->19|37->20|42->25|42->25|77->60|77->60|77->60|81->64|81->64|88->71|88->71|88->71|92->75|92->75|97->80|97->80|97->80|101->84|101->84|106->89|106->89|106->89|110->93|110->93|117->100|117->100|117->100|121->104|121->104|145->128|145->128|145->128|145->128|146->129|146->129|146->129|146->129|146->129|147->130|147->130|147->130|147->130|147->130|147->130|147->130|147->130|147->130
                  -- GENERATED --
              */
          