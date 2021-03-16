
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml

object renderPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[meerkat.PageGenerator.Article],List[scala.Tuple2[Int, List[Int]]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(articles: List[meerkat.PageGenerator.Article], headlines: List[(Int, List[Int])]):play.twirl.api.HtmlFormat.Appendable = {
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
"""),format.raw/*16.1*/("""</style></head>
<body>
<script  src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js" type="text/javascript", language="javascript">
function updateInternal(id, headlines)"""),format.raw/*19.39*/("""{"""),format.raw/*19.40*/("""
  """),format.raw/*20.3*/("""$(document).ready(function() """),format.raw/*20.32*/("""{"""),format.raw/*20.33*/("""
    """),format.raw/*21.5*/("""$.post("http://localhost:9000/updateInternal", """),format.raw/*21.52*/("""{"""),format.raw/*21.53*/(""" """),format.raw/*21.54*/("""articleId: id, headlines: headlines """),format.raw/*21.90*/("""}"""),format.raw/*21.91*/(""" """),format.raw/*21.92*/(""");
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/(""");
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/(""";
</script>
<div id="preloader" style="display: none;"><img class="preloader" src="./public/images/loader.gif" alt="website template image" style="display: none;"></div>
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
          <div class="logo"><a ><img src="./public/images/logo.png" alt="website template image"></a></div>
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
          <div class="masonry-box post-media"><img src="""),_display_(/*57.57*/{articles(0).image}),format.raw/*57.76*/(""" """),format.raw/*57.77*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">

                  <h4><a href="#" onclick="javascript:updateInternal("""),_display_(/*62.71*/{articles(0).id}),format.raw/*62.87*/(""", """),_display_(/*62.90*/{headlines}),format.raw/*62.101*/(""");" id="first">"""),_display_(/*62.117*/{articles(0).headline}),format.raw/*62.139*/("""</a></h4></div>
              </div>
            </div>
          </div>
        </div>
        <div class="center-side">
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*68.67*/{articles(1).image}),format.raw/*68.86*/(""" """),format.raw/*68.87*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="javascript:updateInternal("""),_display_(/*72.59*/{articles(1).id}),format.raw/*72.75*/(""", """),_display_(/*72.78*/{headlines}),format.raw/*72.89*/(""")">"""),_display_(/*72.93*/{articles(1).headline}),format.raw/*72.115*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*77.67*/{articles(2).image}),format.raw/*77.86*/(""" """),format.raw/*77.87*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="javascript:updateInternal("""),_display_(/*81.59*/{articles(2).id}),format.raw/*81.75*/(""", """),_display_(/*81.78*/{headlines}),format.raw/*81.89*/(""")">"""),_display_(/*81.93*/{articles(2).headline}),format.raw/*81.115*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*86.67*/{articles(3).image}),format.raw/*86.86*/(""" """),format.raw/*86.87*/("""style="max-width:98%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="javascript:updateInternal("""),_display_(/*90.59*/{articles(3).id}),format.raw/*90.75*/(""", """),_display_(/*90.78*/{headlines}),format.raw/*90.89*/(""")">"""),_display_(/*90.93*/{articles(3).headline}),format.raw/*90.115*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
          <div class="masonry-box small-box post-media"><img src="""),_display_(/*95.67*/{articles(4).image}),format.raw/*95.86*/(""" """),format.raw/*95.87*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="javascript:updateInternal("""),_display_(/*99.59*/{articles(4).id}),format.raw/*99.75*/(""", """),_display_(/*99.78*/{headlines}),format.raw/*99.89*/(""")">"""),_display_(/*99.93*/{articles(4).headline}),format.raw/*99.115*/("""</a></h4>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="right-side hidden-md-down">
          <div class="masonry-box post-media"><img src="""),_display_(/*106.57*/{articles(5).image}),format.raw/*106.76*/(""" """),format.raw/*106.77*/("""style="max-width:100%;max-height:100%;" alt="website template image" class="img-fluid">
            <div class="shadoweffect">
              <div class="shadow-desc">
                <div class="blog-meta">
                  <h4><a href="javascript:updateInternal("""),_display_(/*110.59*/{articles(5).id}),format.raw/*110.75*/(""", """),_display_(/*110.78*/{headlines}),format.raw/*110.89*/(""")">"""),_display_(/*110.93*/{articles(5).headline}),format.raw/*110.115*/("""</a></h4>
                  <small></small></div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <br>
    <br>
    <br><br><br>
  </section>
   <footer class="footer" style="opacity:0.1;">
    
  </footer>
</div>
<div id="freecssfooter">
  <div id="fcssholder">
    <div id="bsap_2365" class="bsarocks bsap_b893e54e42ad5b76e7b252f59be18e67"></div>
  </div>
</div>
<script type="text/javascript">
var gaProperty = 'UA-120201777-1';var disableStr = 'ga-disable-' + gaProperty;if (document.cookie.indexOf(disableStr + '=true') > -1) """),format.raw/*132.135*/("""{"""),format.raw/*132.136*/("""window[disableStr] = true;"""),format.raw/*132.162*/("""}"""),format.raw/*132.163*/("""
"""),format.raw/*133.1*/("""function gaOptout()"""),format.raw/*133.20*/("""{"""),format.raw/*133.21*/("""document.cookie = disableStr + '=true; expires=Thu, 31 Dec 2045 23:59:59 UTC; path=/';window[disableStr] = true;alert('Google Tracking has been deactivated');"""),format.raw/*133.179*/("""}"""),format.raw/*133.180*/("""
"""),format.raw/*134.1*/("""(function(i,s,o,g,r,a,m)"""),format.raw/*134.25*/("""{"""),format.raw/*134.26*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*134.76*/("""{"""),format.raw/*134.77*/("""(i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*134.112*/("""}"""),format.raw/*134.113*/(""",i[r].l=1*new Date();a=s.createElement(o),m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)"""),format.raw/*134.234*/("""}"""),format.raw/*134.235*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');ga('create', 'UA-120201777-1', 'auto');ga('set', 'anonymizeIp', true);ga('send', 'pageview');
</script>

</body>
</html>
"""))
      }
    }
  }

  def render(articles:List[meerkat.PageGenerator.Article],headlines:List[scala.Tuple2[Int, List[Int]]]): play.twirl.api.HtmlFormat.Appendable = apply(articles,headlines)

  def f:((List[meerkat.PageGenerator.Article],List[scala.Tuple2[Int, List[Int]]]) => play.twirl.api.HtmlFormat.Appendable) = (articles,headlines) => apply(articles,headlines)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-16T19:20:39.156246
                  SOURCE: /home/leon/projects/meerkat/meerkat-play/app/views/renderPage.scala.html
                  HASH: 3336e0b1cea5106f65d6c6e20bee0c1a450846fa
                  MATRIX: 635->1|811->84|838->85|1308->527|1337->528|1488->650|1518->651|1546->652|1607->685|1636->686|1677->699|1706->700|1734->701|1807->746|1836->747|1878->761|1907->762|1935->763|2010->810|2039->811|2092->836|2121->837|2149->838|2365->1026|2394->1027|2424->1030|2481->1059|2510->1060|2542->1065|2617->1112|2646->1113|2675->1114|2739->1150|2768->1151|2797->1152|2827->1155|2855->1156|2885->1159|2913->1160|4516->2736|4556->2755|4585->2756|4890->3034|4927->3050|4957->3053|4990->3064|5034->3080|5078->3102|5293->3290|5333->3309|5362->3310|5654->3575|5691->3591|5721->3594|5753->3605|5784->3609|5828->3631|6011->3787|6051->3806|6080->3807|6372->4072|6409->4088|6439->4091|6471->4102|6502->4106|6546->4128|6729->4284|6769->4303|6798->4304|7089->4568|7126->4584|7156->4587|7188->4598|7219->4602|7263->4624|7446->4780|7486->4799|7515->4800|7807->5065|7844->5081|7874->5084|7906->5095|7937->5099|7981->5121|8218->5330|8259->5349|8289->5350|8582->5615|8620->5631|8651->5634|8684->5645|8716->5649|8761->5671|9374->6254|9405->6255|9461->6281|9492->6282|9521->6283|9569->6302|9599->6303|9787->6461|9818->6462|9847->6463|9900->6487|9930->6488|10009->6538|10039->6539|10104->6574|10135->6575|10286->6696|10317->6697
                  LINES: 14->1|19->2|20->3|29->12|29->12|29->12|29->12|30->13|30->13|30->13|30->13|30->13|31->14|31->14|31->14|31->14|31->14|32->15|32->15|32->15|32->15|32->15|33->16|36->19|36->19|37->20|37->20|37->20|38->21|38->21|38->21|38->21|38->21|38->21|38->21|39->22|39->22|40->23|40->23|74->57|74->57|74->57|79->62|79->62|79->62|79->62|79->62|79->62|85->68|85->68|85->68|89->72|89->72|89->72|89->72|89->72|89->72|94->77|94->77|94->77|98->81|98->81|98->81|98->81|98->81|98->81|103->86|103->86|103->86|107->90|107->90|107->90|107->90|107->90|107->90|112->95|112->95|112->95|116->99|116->99|116->99|116->99|116->99|116->99|123->106|123->106|123->106|127->110|127->110|127->110|127->110|127->110|127->110|149->132|149->132|149->132|149->132|150->133|150->133|150->133|150->133|150->133|151->134|151->134|151->134|151->134|151->134|151->134|151->134|151->134|151->134
                  -- GENERATED --
              */
          