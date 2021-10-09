// Copyright (c) 2019, the Dart project authors.  Please see the AUTHORS file
// for details. All rights reserved. Use of this source code is governed by a
// BSD-style license that can be found in the LICENSE file.

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  @override
  _MyHomeState createState() => _MyHomeState();
}

class _MyHomeState extends State<MyHomePage> {
  ValueNotifier<double> _elevationNotifier;
  ValueNotifier<int> _boxColorNotifier;
  ValueNotifier<int> _shadowColorNotifier;
  ValueNotifier<double> _opacityNotifier;
  ValueNotifier<int> _backgroundColorNotifier;

  final _colorCount = Colors.primaries.length - 1.0;

  @override
  void initState() {
    _elevationNotifier = ValueNotifier(0.0);
    _boxColorNotifier = ValueNotifier(0);
    _shadowColorNotifier = ValueNotifier(0);
    _opacityNotifier = ValueNotifier(1.0);
    _backgroundColorNotifier = ValueNotifier(0);
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("PhysicalModel"),
      ),
      body: Column(
        children: <Widget>[
          Spacer(),
          PhysicalModel(
            elevation: _elevationNotifier.value,
            color: Colors.primaries[_backgroundColorNotifier.value],
            child: Box(
              color: Colors.primaries[_boxColorNotifier.value],
              opacity: _opacityNotifier.value,
            ),
            shadowColor: Colors.primaries[_shadowColorNotifier.value],
            borderRadius: BorderRadius.circular(45),
          ),
          Spacer(),
          Row(
            children: <Widget>[
              Padding(
                padding: const EdgeInsetsDirectional.only(start: 16.0),
                child: Text("Box Elevation: "),
              ),
              Expanded(
                child: Slider(
                  min: 0,
                  max: 100,
                  value: _elevationNotifier.value,
                  onChanged: (value) =>
                      setState(() => _elevationNotifier.value = value),
                ),
              ),
            ],
          ),
          Row(
            children: <Widget>[
              Padding(
                padding: const EdgeInsetsDirectional.only(start: 16.0),
                child: Text("Box Color: "),
              ),
              Expanded(
                child: Slider(
                  min: 0,
                  max: _colorCount.toDouble(),
                  value: _boxColorNotifier.value.toDouble(),
                  onChanged: (value) =>
                      setState(() => _boxColorNotifier.value = value.floor()),
                  activeColor: Colors.primaries[_boxColorNotifier.value],
                ),
              ),
            ],
          ),
          Row(
            children: <Widget>[
              Padding(
                padding: const EdgeInsetsDirectional.only(start: 16.0),
                child: Text("Shadow Color: "),
              ),
              Expanded(
                child: Slider(
                  min: 0,
                  max: _colorCount.toDouble(),
                  value: _shadowColorNotifier.value.toDouble(),
                  onChanged: (value) => setState(
                      () => _shadowColorNotifier.value = value.floor()),
                  activeColor: Colors.primaries[_shadowColorNotifier.value],
                ),
              ),
            ],
          ),
          Row(
            children: <Widget>[
              Padding(
                padding: const EdgeInsetsDirectional.only(start: 16.0),
                child: Text("Background Color: "),
              ),
              Expanded(
                child: Slider(
                  min: 0,
                  max: _colorCount.toDouble(),
                  value: _backgroundColorNotifier.value.toDouble(),
                  onChanged: (value) => setState(
                      () => _backgroundColorNotifier.value = value.floor()),
                  activeColor: Colors.primaries[_backgroundColorNotifier.value],
                ),
              ),
            ],
          ),
          Row(
            children: <Widget>[
              Padding(
                padding: const EdgeInsetsDirectional.only(start: 16.0),
                child: Text("Opacity: "),
              ),
              Expanded(
                child: Slider(
                  min: 0,
                  max: 100,
                  value: _opacityNotifier.value * 100,
                  onChanged: (value) =>
                      setState(() => _opacityNotifier.value = value / 100),
                ),
              ),
            ],
          ),
        ],
      ),
    );
  }
}

class Box extends StatelessWidget {
  final Color color;
  final double opacity;

  Box({Key key, this.color, this.opacity}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: 200,
      height: 200,
      color: color.withOpacity(opacity),
    );
  }
}
