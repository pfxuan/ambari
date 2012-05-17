<html>
  <head>
    <title id="pageTitleId">Hortonworks Data Platform Portal</title>

    <!-- CSS -->
    <link type="text/css" rel="stylesheet" href="../yui-3.4.1/build/cssreset/cssreset-min.css">
    <link type="text/css" rel="stylesheet" href="../css/bootstrap.css" media="screen"/>
    <link type="text/css" rel="stylesheet" href="../css/common.css" media="screen"/>
    <link type="text/css" rel="stylesheet" href="../css/common2.css" media="screen"/>
    <link type="text/css" rel="stylesheet" href="../css/common3.css" media="screen"/>
    <link type="text/css" rel="stylesheet" href="../css/clusters.css" media="screen"/>
    <!-- End CSS -->
  </head>

  <body class="yui3-skin-sam">
    <?php require "./topnav.html"; ?>

    <h1> Cluster <?php echo $_GET['clusterName']; ?> </h1>

    <br/>

    <div id="contentDivId"> 

      <?php require "./utils.htmli"; ?>

      <!-- The Main Event -->
      <div id="clustersCoreDivId">
        <div id="clustersNavigationLinksDivId">
          <ul id="clustersNavigationLinksListId">
            <li class="clustersNavigationLinkEntry">
              <a href="../../hdp/dashboard/ui/home.html">
                Monitoring Dashboard
              </a>
            </li>
            <li class="clustersNavigationLinkEntry">
              <a href="../html/manageServices.php?clusterName=<?php echo $_GET['clusterName']; ?>">
                Start/Stop/Reconfigure Services
              </a>
            </li>
            <li class="clustersNavigationLinkEntry">
              <a href="../html/uninstallCluster.php?clusterName=<?php echo $_GET['clusterName']; ?>">
                Uninstall
              </a>
            </li>
          </ul>
        </div>

        <br/>

        <div id="clustersHostRoleMappingDynamicRenderDivId">
        </div>
      </div>
      <!-- End of clustersCoreDivId -->

      <?php require "./txnUtils.htmli"; ?>

    </div>
    <!-- End of contentDivId -->

    <?php require "./footer.html"; ?>

    <!-- Javascript Scaffolding -->
    <script type="text/javascript">
      /* Minimal data required to bootstrap clusters.js. */
      var clusterName = '<?php echo $_GET['clusterName']; ?>';

      var jsFilesToLoad = [ 
        '../js/utils.js',
        '../js/txnUtils.js',
        '../js/clusters.js' 
      ];
    </script>

    <?php require "./bootstrapJs.htmli"; ?>
    <!-- End of Javascript Scaffolding -->
  </body>
</html> 